SUMMARY = "Python Utility and Demonstration Scripts"
DESCRIPTION = "A number of scripts that are useful for building, testing or extending Python, \
and a set of demonstration programs."
LICENSE = "Python-2.0"

PV = "3.8.16"

RPM_NAME = "python38-tools-3.8.16-7.1.aarch64.rpm"
RPM_HASH = "baa7efe1ab36a6cbaf0c785a6e47a478ba9a4238c73d858096634c15f83a2e3015008106c2c6533fe5e1ab15f487fcaa176fd8234077599e39be4c87042daf0c"

RPROVIDES:${PN} += "python38-2to3 \
python38-demo \
python38-tools \
python38-tools(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/python3.8 \
python(abi) \
python38-base"

inherit rpm
