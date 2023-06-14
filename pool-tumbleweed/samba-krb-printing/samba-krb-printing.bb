SUMMARY = "Wrapper binary for kerberized printing"
DESCRIPTION = "A wrapper binary to run smbspool with the original calling UID."
LICENSE = "GPL-3.0+"

PV = "3.7.0"

RPM_NAME = "samba-krb-printing-3.7.0-1.26.aarch64.rpm"
RPM_HASH = "a7b6f0ec9fa8601299c6e8db6911161677e4818639e9794c9ad98b915d4720497d40a6aa798c6cb677c1a5df899c7576f05b0ab6c4412101c362288b360f1d97"

RPROVIDES:${PN} += "samba-gplv3-krb-printing \
samba-krb-printing"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
cups \
libc.so.6 \
samba-client"

inherit rpm
