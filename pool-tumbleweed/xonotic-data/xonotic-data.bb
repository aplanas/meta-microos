SUMMARY = "Data for the xonotic first person shooter"
DESCRIPTION = "Xonotic is a free (GPL), fast-paced first-person shooter that works on Windows, OS X and Linux. The project is geared towards providing addictive arena shooter gameplay which is all spawned and driven by the community itself. Xonotic is a direct successor of the Nexuiz project with years of development between them, and it aims to become the best possible open-source FPS (first-person-shooter) of its kind. \
 \
Data (textures, maps, sounds and models) required to play xonotic."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.6"

RPM_NAME = "xonotic-data-0.8.6-1.1.noarch.rpm"
RPM_HASH = "6ea0f1dc074a0f516fcd4de4da61accfaa6f14b3e1ff9828303732fff34cbcff16e7d62cf241bd41a3d4e2df699a83e4c752f720fbb9fdcd2b8916c95127691a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xonotic-data"

RDEPENDS:${PN} += ""

inherit rpm
