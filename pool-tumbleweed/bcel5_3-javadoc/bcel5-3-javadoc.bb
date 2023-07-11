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

RPM_NAME = "bcel5_3-javadoc-5.3-21.3.noarch.rpm"
RPM_HASH = "72f646e7655b91a1de890c83734792de0df1b05febb873ccfe1fd412c21fa3f1749e2d1a4cac432dd1c0981f629eb5310a5176f236bff0c4493b5317c44a6d3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bcel5-3-javadoc"

RDEPENDS:${PN} += ""

inherit rpm
