SUMMARY = "Demonstration and samples for jython"
DESCRIPTION = "This package contains demonstration and sample files for Jython. \
 \
Jython is an implementation of the high-level, dynamic, object-oriented \
language Python seamlessly integrated with the Java platform. The \
predecessor to Jython, JPython, is certified as 100% Pure Java. Jython \
is freely available for both commercial and non-commercial use and is \
distributed with source code. Jython is complementary to Java and is \
especially suited for the following tasks: Embedded scripting - Java \
programmers can add the Jython libraries to their system to allow end \
users to write simple or complicated scripts that add functionality to \
the application. Interactive experimentation - Jython provides an \
interactive interpreter that can be used to interact with Java packages \
or with running Java applications. This allows programmers to \
experiment and debug any Java system using Jython. Rapid application \
development - Python programs are typically 2-10X shorter than the \
equivalent Java program. This translates directly to increased \
programmer productivity. The seamless interaction between Python and \
Java allows developers to freely mix the two languages both during \
development and in shipping products."
LICENSE = "Apache-2.0 & Python-2.0"

PV = "2.2.1"

RPM_NAME = "jython-demo-2.2.1-25.7.noarch.rpm"
RPM_HASH = "8dc19baf17ad64829ad15a4ffd3f2b079ec21d5656fa1c385b2064bb6816b7934874cbfa194a200139e905e8a8d137bbc81eb8484ab89b4d5335e4f9d3d93caf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jython-demo"

RDEPENDS:${PN} += "jython"

inherit rpm
