SUMMARY = "Python API for configuring sssd"
DESCRIPTION = "Provide python module to access and manage configuration of the System \
Security Services Daemon (sssd)."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "2.9.0"

RPM_NAME = "python3-sssd-config-2.9.0-1.1.aarch64.rpm"
RPM_HASH = "0e5a69b8467a01f389473f23def823e23c658af2541dbad5f9c0375c1b31558163a5048a4a9374ac49091c4e7c1705f1c13fcf009225f74e560a6d0b04fa31ea"

RPROVIDES:${PN} += "python3-sssd-config \
python3-sssd-config(aarch-64) \
python3.10dist(sssdconfig) \
python3dist(sssdconfig)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libldb.so.2()(64bit) \
libldb.so.2(LDB_0.9.10)(64bit) \
libpopt.so.0()(64bit) \
libpopt.so.0(LIBPOPT_0)(64bit) \
libsss_crypt.so()(64bit) \
libsss_crypt.so(V_2.9.0)(64bit) \
libsss_debug.so()(64bit) \
libsss_debug.so(V_2.9.0)(64bit) \
libsss_util.so()(64bit) \
libsss_util.so(V_2.9.0)(64bit) \
libtalloc.so.2()(64bit) \
libtalloc.so.2(TALLOC_2.0.2)(64bit) \
python(abi) \
python3"

inherit rpm
