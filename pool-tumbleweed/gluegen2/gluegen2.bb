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

RPM_NAME = "gluegen2-2.3.2-9.9.aarch64.rpm"
RPM_HASH = "65d74bf4ce41207a07490864d05c5411844f81cc6a3ca94894201f82bcdc34d24df3a99bb1b2daa92929266fe8705e6966cc3d7266a9ba4130e4d18df7171792"

RPROVIDES:${PN} += "gluegen2 \
libgluegen2-rt.so"

RDEPENDS:${PN} += "java \
libc.so.6"

inherit rpm
