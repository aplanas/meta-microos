SUMMARY = "Framework for writing simple makefiles for complex tasks"
DESCRIPTION = "The goals of the kBuild framework: \
 \
 - Similar behavior across all supported platforms \
 - Flexibility, don't create unnecessary restrictions preventing ad-hoc \
   solutions \
 - Makefiles can be simple to write and maintain \
 - One configuration file for a subtree automatically included \
 - Target configuration templates as the primary mechanism for makefile \
   simplification \
 - Tools and SDKs for helping out the templates with flexibility \
 - Non-recursive makefile method by using sub-makefiles"
LICENSE = "GPL-2.0-or-later"

PV = "0.1.9998svn3427"

RPM_NAME = "kbuild-0.1.9998svn3427-1.12.aarch64.rpm"
RPM_HASH = "894d79bba760ed5dbc2824d0f741a746cca5af41582b66adb58627fb7bf014bc203eca56fdcea13b23438cb24983f433a524e50ef11c9ddd05c1e10ad49b1707"

RPROVIDES:${PN} += "kbuild"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
