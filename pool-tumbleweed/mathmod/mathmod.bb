SUMMARY = "Mathematical modelling to visualise implicit and parametric surfaces"
DESCRIPTION = "MathMod is a mathematical modeling software to model, plot and animate \
3D/4D parametric and implicit surfaces. \
 \
Features: \
 * 3D and 4D plotting and animation \
 * OBJ output file format \
 * Scripting language in JSON file format \
 * Texture and pigmentation support \
 * Noise and Turbulence effects support \
 * Large set of scripted examples"
LICENSE = "GPL-2.0-or-later"

PV = "11.1"

RPM_NAME = "mathmod-11.1-1.7.aarch64.rpm"
RPM_HASH = "719ccfe083d0bde15fa19c6422f1ee23e65e240570922b644bf226c53857e7f62cbff3f4a58c010d333c427b4e579f62b86a62a2bd39a1de147106c85092ca54"

RPROVIDES:${PN} += "mathmod"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
