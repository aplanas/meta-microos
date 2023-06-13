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

RPM_NAME = "kbuild-0.1.9998svn3427-1.11.aarch64.rpm"
RPM_HASH = "2f973e9330bacb5ac377f3a871327d12b2f3c1ac48a7be0ab34bf60ea69bed465e1f0593f404a13049a9554d79b435d56f9f710735c877af9c45a7a557cbbcc6"

RPROVIDES:${PN} += "kbuild \
kbuild(aarch-64)"

RDEPENDS:${PN} += "libc.so.6()(64bit)"

inherit rpm
