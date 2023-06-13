SUMMARY = "Javadoc for bcel5_3"
DESCRIPTION = "The Byte Code Engineering Library (formerly known as JavaClass) is \
intended to give users a convenient possibility to analyze, create, and \
manipulate (binary) Java class files (those ending with .class). Classes \
are represented by objects which contain all the symbolic information of \
the given class: methods, fields and byte code instructions, in \
particular.  Such objects can be read from an existing file, be \
transformed by a program (e.g. a class loader at run-time) and dumped to \
a file again. An even more interesting application is the creation of \
classes from scratch at run-time. The Byte Code Engineering Library \
(BCEL) may be also useful if you want to learn about the Java Virtual \
Machine (JVM) and the format of Java .class files.  BCEL is already \
being used successfully in several projects such as compilers, \
optimizers, obsfuscators and analysis tools, the most popular probably \
being the Xalan XSLT processor at Apache."
LICENSE = "Apache-2.0"

PV = "5.3"

RPM_NAME = "bcel5_3-javadoc-5.3-21.2.noarch.rpm"
RPM_HASH = "3f91113b8b80677826b768d2be9068241bab30bb8ed2fa4db677f69dfd05941194ff7763acc390869072072e2513d55d3701c0bff3526e0693c36a1840af5690"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bcel5_3-javadoc"

RDEPENDS:${PN} += ""

inherit rpm
