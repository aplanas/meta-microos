SUMMARY = "An Interpreted Object-Oriented Scripting Language"
DESCRIPTION = "Ruby is an interpreted scripting language for quick and easy \
object-oriented programming.  It has many features for processing text \
files and performing system management tasks (as in Perl).  It is \
simple, straight-forward, and extensible. \
 \
* Ruby features: \
 \
- Simple Syntax \
 \
- *Normal* Object-Oriented features (class, method calls, for \
   example) \
 \
- *Advanced* Object-Oriented features(Mix-in, Singleton-method, for \
   example) \
 \
- Operator Overloading \
 \
- Exception Handling \
 \
- Iterators and Closures \
 \
- Garbage Collection \
 \
- Dynamic Loading of Object Files (on some architectures) \
 \
- Highly Portable (works on many UNIX machines; DOS, Windows, Mac, \
BeOS, and more)"
LICENSE = "MIT"

PV = "3.2"

RPM_NAME = "ruby-3.2-1.2.aarch64.rpm"
RPM_HASH = "403b17259b674ef788308a7a35431dc2a0fecfcb2f22f90512f72fd740da4c784433cae93dbcb0f1677d1cc49bd3f4bc87362dcc89317951eae1a388e3e960aa"

RPROVIDES:${PN} += "ruby \
rubygems"

RDEPENDS:${PN} += "ruby3.2"

inherit rpm
