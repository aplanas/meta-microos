SUMMARY = "A utility to locally store files on a HTTP server"
DESCRIPTION = "A utility that accesses files on an HTTP server and stores them \
locally for reuse."
LICENSE = "GPL-3.0-or-later"

PV = "0.3.1"

RPM_NAME = "python311-serverfiles-0.3.1-1.8.noarch.rpm"
RPM_HASH = "c0fbd9629fdea6f38bb03fbaf1ad9422365b34148351206f37416b44394b0fdf0985a8ca79d0f469b763ad2806c8e969a7e440369194b36c4c65a378226da2f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-serverfiles \
python311-serverfiles \
python3dist-serverfiles"

RDEPENDS:${PN} += "python-abi \
python311-requests"

inherit rpm
