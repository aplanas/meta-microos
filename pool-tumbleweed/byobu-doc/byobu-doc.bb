SUMMARY = "Documentation files for byobu"
DESCRIPTION = "Help files and changelog for byobu."
LICENSE = "GPL-3.0-only"

PV = "5.133"

RPM_NAME = "byobu-doc-5.133-2.14.noarch.rpm"
RPM_HASH = "315630541b6e68645061fa6da5143e94ab5e46d101b522fdef900af16491639df53fbdc4481b7139e722e92768acd1b18bd541a4dd1c8579face803e44be89c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "byobu-doc"

RDEPENDS:${PN} += "byobu"

inherit rpm
