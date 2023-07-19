SUMMARY = "Empty package to ensure rebuilding kernel-default-base in OBS"
DESCRIPTION = "This is empty package that ensures kernel-default-base is rebuilt every time \
kernel-default is rebuilt in OBS. \
 \
There is no reason to install this package."
LICENSE = "GPL-2.0-only"

PV = "6.4.3"

RPM_NAME = "kernel-default-base-rebuild-6.4.3-1.1.28.3.aarch64.rpm"
RPM_HASH = "ef5c596714793e495066e8e7a5008c45142e9f60f14b07e47eeda924184b5b60dacb3244df200470605763af29728a86dafebcbf14126424057ec71ac66bf7e3"

RPROVIDES:${PN} += "kernel-default-base-rebuild"

RDEPENDS:${PN} += "kernel-default"

inherit rpm
