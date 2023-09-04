SUMMARY = "Some Blender demo files"
DESCRIPTION = "Some Blender demo scenes \
 \
geeko_example_scene: showing raytracing, rigging, animation, curves, \
                     shading, texturing, vertex groups and rendering."
LICENSE = "CC-BY-4.0"

PV = "3.6.2"

RPM_NAME = "blender-demo-3.6.2-1.1.noarch.rpm"
RPM_HASH = "a660c0a4effc42400ff71df688223b51951d8efe6d9b3a1bceae3871146a3cc144b5870972b067eac361f019f7889971bbb0ad4c370ca434626d5ab66d34c305"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "blender-demo"

RDEPENDS:${PN} += ""

inherit rpm
