SUMMARY = "IBM Java Compiler"
DESCRIPTION = "Jikes(TM) is a compiler that translates Java(TM) source files as \
defined in 'The Java Language Specification' into the byte code \
instruction set and binary format defined in 'The Java Virtual Machine \
Specification.' \
 \
You may wonder why the world needs another Java compiler, considering \
that Sun provides javac free with its SDK. Jikes has four advantages \
that make it a valuable contribution to the Java community: \
 \
* Open source. Jikes is OSI Certified Open Source Software. OSI \
   Certified is a certification mark of the Open Source Initiative. \
 \
* Strictly Java compatible. Jikes strives to adhere to both 'The \
   Java Language Specification' and 'The Java Virtual Machine \
   Specification' as tightly as possible and does not support \
   subsets, supersets, or other variations of the language. The FAQ \
   describes some of the side effects of this strict language \
   conformance. \
 \
* High performance. Jikes is a high performance compiler, making it \
   ideal for use with larger projects. \
 \
* Dependency analysis. Jikes performs a dependency analysis on your \
   code that provides two very useful features: Incremental builds \
   and makefile generation. \
 \
Note that you must set CLASSPATH correctly to use jikes."
LICENSE = "IPL-1.0"

PV = "1.22"

RPM_NAME = "jikes-1.22-160.23.aarch64.rpm"
RPM_HASH = "89441f87b05aaeca6baa87a344999e0a40ab50174f24808be681a6e05ab9f19aa85eb7f7159e018f71d753f6e59d521b66d417e3549f68fd1c09b8c01a247c74"

RPROVIDES:${PN} += "jikes"

RDEPENDS:${PN} += "jre \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
