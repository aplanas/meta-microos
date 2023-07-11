SUMMARY = "Some Blender demo files"
DESCRIPTION = "Some Blender demo scenes \
 \
geeko_example_scene: showing raytracing, rigging, animation, curves, \
                     shading, texturing, vertex groups and rendering."
LICENSE = "CC-BY-4.0"

PV = "3.5.1"

RPM_NAME = "blender-demo-3.5.1-1.2.noarch.rpm"
RPM_HASH = "15914ff0c218e20b02d563c45ef717ec9e8d4241fe4ebe86b5142662defaad4612103052dc9184f2d6145a1881f1eba55a54d35724f78407f493d35e247408f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "blender-demo"

RDEPENDS:${PN} += ""

inherit rpm
