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

RPM_NAME = "mathmod-11.1-1.8.aarch64.rpm"
RPM_HASH = "1ca0c1ad7adc1a1cc7be18d3ee48d20017dc119208dbde1e39b0e0d082af6ec2c0d678a496f08adc7884a4d1b8e77081065cc91204fbd6fda6b9049c47a05856"

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
