SUMMARY = "Action Adventure in Space"
DESCRIPTION = "Rescue! Max is an Action Adventure in Space written in java. \
It is based on an old mac game called Rescue! by Tom Spreen. \
 \
A 2D space real-time, action/strategy game. You are in control of a ship that \
you fly around space fighting enemies and making friends on your way. \
The main objective is to rescue people from planets and take them to star bases."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.5"

RPM_NAME = "rescue-1.0.5-1.1.noarch.rpm"
RPM_HASH = "8115607b5b0833b8e1213ff06c37c22211e30cbeb6881c207354b2492986edbe07afdf3a9fa2832ca7d0ff6b033548d423440d42b4b8272abf9fae08f5630b46"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rescue"

RDEPENDS:${PN} += "/bin/sh \
jre"

inherit rpm
