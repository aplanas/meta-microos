SUMMARY = "Documentation for OpenStack Glance API Client"
DESCRIPTION = "This is a client for the OpenStack Glance API. There's a Python API (the \
glanceclient module), and a command-line script (glance). Each implements \
100% of the OpenStack Glance API. \
This package contains auto-generated documentation."
LICENSE = "Apache-2.0"

PV = "4.3.0"

RPM_NAME = "python-glanceclient-doc-4.3.0-1.2.noarch.rpm"
RPM_HASH = "41a1bd0709c128fa941578c704bddd5339e355227886a847b682d1ef13554f6c0483f0ef90665b3265bc628fe53c49776928710f630572e9b4726179459d8994"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-glanceclient-doc"

RDEPENDS:${PN} += ""

inherit rpm
