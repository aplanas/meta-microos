SUMMARY = "Sound synthesis and audio signal processing environment"
DESCRIPTION = "Cecilia is a graphic user interface for the sound synthesis and sound \
processing package CSound. Cecilia enables the user to build very \
quickly graphic interfaces with sliders and curves to control CSound \
instruments. It is also an editor to CSound with syntax highlighting \
and a built-in reference. It is also a great tool to explore the parameters \
of a new opcode in an interactive and intuitive way. \
 \
Cecilia uses the pyo audio engine created for the Python programming language. \
 \
Cecilia was designed by and for musicians and sound designers. All \
the traditional sound processing devices are included such as EQs, \
compressors and delays adapted for the most simple applications and \
the wildest imaginable sonic contortions."
LICENSE = "GPL-3.0-or-later"

PV = "5.4.1"

RPM_NAME = "cecilia-5.4.1-1.7.noarch.rpm"
RPM_HASH = "8b4f335ba128b905092589e9de6c60ae88b8176404d195e0d67935485aae1d09a81f79c60b2d075217e39844d775a14f1c2154c03a5911206b5f3ffde6b73c58"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() \
application(cecilia.desktop) \
cecilia \
python3.10dist(cecilia) \
python3dist(cecilia)"
RDEPENDS:${PN} += "/usr/bin/python3 \
python(abi) \
python3-numpy \
python3-pyo \
python3-wxPython"

inherit rpm
