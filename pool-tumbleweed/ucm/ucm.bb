SUMMARY = "Unicode Font Viewer"
DESCRIPTION = "Ucm is a small xfs-like widget specifically designed for Unicode fonts. \
 As opposed to xfs, ucm allows you to select an arbitrary character \
which can then be pasted into another application or identify an \
arbitrary character by pasting it into ucm."
LICENSE = "BSD-3-Clause & MIT"

PV = "0.3"

RPM_NAME = "ucm-0.3-542.20.aarch64.rpm"
RPM_HASH = "4682d5afd732936414ddee82777fb3786cb522b33e34ac38b1324a86b55128efe3216c14667b55ee74829fff399b59b17bc5e0c542f40dd4632f771b1f157f31"

RPROVIDES:${PN} += "ucm"

RDEPENDS:${PN} += "gnu-unifont \
libX11.so.6 \
libXaw.so.7 \
libXmu.so.6 \
libXt.so.6 \
libc.so.6"

inherit rpm
