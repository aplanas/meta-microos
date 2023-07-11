SUMMARY = "Tool for automatic generation the Java and JNI code"
DESCRIPTION = "This package contains gluegen source code needed to build packages."
LICENSE = "BSD-2-Clause"

PV = "2.3.2"

RPM_NAME = "gluegen2-devel-2.3.2-9.9.noarch.rpm"
RPM_HASH = "13e6b4178e9e074fd6678ca40e89c8921e588402f42cf6cec894e8bd431c11533cf970bcc3e6dd9df1fe7007da9148ca1d8de4083fce0002848ba31c66a4433c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gluegen2-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ant-antlr \
ant-contrib \
ant-junit \
cpptasks \
gluegen2"

inherit rpm
