SUMMARY = "Some Blender demo files"
DESCRIPTION = "Some Blender demo scenes \
 \
geeko_example_scene: showing raytracing, rigging, animation, curves, \
                     shading, texturing, vertex groups and rendering."
LICENSE = "CC-BY-4.0"

PV = "3.5.0"

RPM_NAME = "blender-demo-3.5.0-1.2.noarch.rpm"
RPM_HASH = "940fa15709d52a6fbd77ec04587e16efcbd137923b0118a46b9e9b986a800395254fdc51d332e07c9f74b907228836b9e2698356ca633988ec4d096f7076ee00"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "blender-demo"

RDEPENDS:${PN} += ""

inherit rpm
