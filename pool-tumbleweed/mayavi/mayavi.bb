SUMMARY = "3D visualization of scientific data in Python"
DESCRIPTION = "Mayavi provides interactive visualization of 3-D data. It offers: \
 \
 * An (optional) user interface with dialogs to interact with \
   all data and objects in the visualization. \
 * A scripting interface in Python, including \
   one-liners, or an object-oriented programming interface. Mayavi \
   integrates with numpy and scipy for 3D plotting and can \
   be used in IPython interactively, similarly to Matplotlib. \
 * Use of the the VTK toolkit. \
 \
Additionally, Mayavi is a reusable tool that can be embedded in \
applications in different ways or be combined with the Envisage \
application-building framework to assemble domain-specific tools. \
 \
It is part of the Enthought Tool Suite (ETS)."
LICENSE = "BSD-3-Clause & EPL-1.0 & LGPL-2.0-or-later & LGPL-3.0-or-later"

PV = "4.7.4"

RPM_NAME = "mayavi-4.7.4-1.7.aarch64.rpm"
RPM_HASH = "61a34fbe20bdfdf8ade0e4be94b04f3f1883118dbe22e74ab3c2f7e6cbc0cb616215c6832630524acdaa66fac60bba4e8633dd8e27e9f5e918f41761def2795a"

RPROVIDES:${PN} += "mayavi \
python3-mayavi \
python3.10dist-mayavi \
python3dist-mayavi"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-Pygments \
python3-apptools \
python3-envisage \
python3-qt5 \
python3-tvtk"

inherit rpm
