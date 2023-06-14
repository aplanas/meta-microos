SUMMARY = "Tool for automatic generation the Java and JNI code"
DESCRIPTION = "GlueGen is a tool which automatically generates the Java and JNI code \
necessary to call C libraries. It reads as input ANSI C header files and \
separate configuration files which provide control over many aspects of \
the glue code generation. GlueGen uses a complete ANSI C parser and \
an internal representation (IR) capable of representing all C types \
to represent the APIs for which it generates interfaces. It has \
the ability to perform significant transformations on the IR before \
glue code emission. GlueGen is currently powerful enough to bind even \
low-level APIs such as the Java Native Interface (JNI) and \
the AWT Native Interface (JAWT) back up to the Java programming language."
LICENSE = "BSD-2-Clause"

PV = "2.3.2"

RPM_NAME = "gluegen2-2.3.2-9.8.aarch64.rpm"
RPM_HASH = "7867c3f54df70ea5637ca91ebc40e5ab8a208e9eee9fd4fc766345871e260c057b016052528ba65596e1097f9aaee95524ca9e4c17d158992c4486be401a4057"

RPROVIDES:${PN} += "gluegen2 \
libgluegen2-rt.so"

RDEPENDS:${PN} += "java \
libc.so.6"

inherit rpm
