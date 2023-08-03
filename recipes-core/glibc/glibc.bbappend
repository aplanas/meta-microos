PROVIDES += "virtual/libc \
	     virtual/libintl \
	     virtual/libiconv"

# filesystem add the links from /lib[64] to /usr/lib[64], to resolve
# usrmerge.  Those links are transformed into directories by the
# do_populate_sysroot task, so we add them back here.
SYSROOT_PREPROCESS_FUNCS:append:class-target = " prepare_usrmerge_sysroot"

prepare_usrmerge_sysroot() {
    mkdir -p ${SYSROOT_DESTDIR}${libdir}
    [ ! -e ${SYSROOT_DESTDIR}${base_libdir} ] && ln -sr ${SYSROOT_DESTDIR}${libdir} ${SYSROOT_DESTDIR}${base_libdir}

    mkdir -p ${SYSROOT_DESTDIR}${libdir}64
    [ ! -e ${SYSROOT_DESTDIR}${base_libdir}64 ] && ln -sr ${SYSROOT_DESTDIR}${libdir}64 ${SYSROOT_DESTDIR}${base_libdir}64
}
