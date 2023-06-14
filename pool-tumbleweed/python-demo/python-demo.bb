SUMMARY = "Python Demonstration Scripts"
DESCRIPTION = "Various demonstrations of what you can do with Python and a number of \
programs that are useful for building or extending Python."
LICENSE = "Python-2.0"

PV = "2.7.18"

RPM_NAME = "python-demo-2.7.18-34.1.aarch64.rpm"
RPM_HASH = "13f271195d341c5697f3aaf8e4e43c03ada1ad43808101d9ef051f2f0f770c668a3bf9dbf15f3684dfc866872de74183c34961df3c2a29f0800fb1f2f36304ba"

RPROVIDES:${PN} += "pyth-dmo \
python-demo \
python2-demo"

RDEPENDS:${PN} += "python-base"

inherit rpm
