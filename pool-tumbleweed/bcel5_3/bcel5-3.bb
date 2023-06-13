SUMMARY = "Byte Code Engineering Library"
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

RPM_NAME = "bcel5_3-5.3-21.2.noarch.rpm"
RPM_HASH = "681414b5039d03bee1c912db809b86d277a55ca5a7807c6fcbaf265dcae399dc52f9603cbc9c7755149c665a1cba371ea1b75617af367e79708e69903aa3f0a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bcel5.3 \
bcel5_3"

RDEPENDS:${PN} += ""

inherit rpm
