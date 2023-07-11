SUMMARY = "Maxima compiled with SBCL"
DESCRIPTION = "Maxima compiled with SBCL."
LICENSE = "GPL-2.0-or-later"

PV = "5.47.0"

RPM_NAME = "maxima-exec-sbcl-5.47.0-1.3.aarch64.rpm"
RPM_HASH = "71afa19dc8bac850539bd6dc40b9ada6319e496ef6047bae5c1e3e8a08a99c68f26aa568b5c5f3847956358c874981c67db4afd5d7c379fc95bd2b090de6948b"

RPROVIDES:${PN} += "maxima-exec \
maxima-exec-sbcl"

RDEPENDS:${PN} += "sbcl"

inherit rpm
