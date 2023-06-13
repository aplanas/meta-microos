SUMMARY = "Data for the xonotic first person shooter"
DESCRIPTION = "Xonotic is a free (GPL), fast-paced first-person shooter that works on Windows, OS X and Linux. The project is geared towards providing addictive arena shooter gameplay which is all spawned and driven by the community itself. Xonotic is a direct successor of the Nexuiz project with years of development between them, and it aims to become the best possible open-source FPS (first-person-shooter) of its kind. \
 \
Data (textures, maps, sounds and models) required to play xonotic."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.5"

RPM_NAME = "xonotic-data-0.8.5-1.5.noarch.rpm"
RPM_HASH = "ef8a41fc97c5cc5afbffc7482268edffc2ca947160145e11c3d559750362d30b86c80d2e8daa23515250e36bd0c2d045aa99f011b71192a3c01391eb68b1b522"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xonotic-data"

RDEPENDS:${PN} += ""

inherit rpm
