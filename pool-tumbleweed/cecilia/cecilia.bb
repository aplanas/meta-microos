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

RPM_NAME = "cecilia-5.4.1-1.8.noarch.rpm"
RPM_HASH = "d282aae099c0bcadacc5420eeae7f9e7f45f24cdd558493cebd6297c304bd60a0cb19224457e1be6027220f5d0ada05d006842efc448d5566418927a5e2bd2dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cecilia \
python3.11dist-cecilia \
python3dist-cecilia"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-numpy \
python3-pyo \
python3-wxPython"

inherit rpm
