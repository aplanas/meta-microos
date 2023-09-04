SUMMARY = "Python Demonstration Scripts"
DESCRIPTION = "Various demonstrations of what you can do with Python and a number of \
programs that are useful for building or extending Python."
LICENSE = "Python-2.0"

PV = "2.7.18"

RPM_NAME = "python-demo-2.7.18-37.1.aarch64.rpm"
RPM_HASH = "d78c126d0206dda20d11eecb4e21d801d920b6988f9045007bab006c59342621c1e3265298e3fc94115276391bb467c8d5cd48879d7495a58593534b750d51b0"

RPROVIDES:${PN} += "pyth-dmo \
python-demo \
python2-demo"

RDEPENDS:${PN} += "python-base"

inherit rpm
