SUMMARY = "A Ruby wrapper for the MRI 2.0 debug_inspector API"
DESCRIPTION = "Adds methods to RubyVM::DebugInspector to allow for inspection of backtrace \
frames. \
The debug_inspector C extension and API were designed and built by Koichi \
Sasada, this project is just a gemification of his work. \
This library makes use of the debug inspector API which was added to MRI \
2.0.0. \
Only works on MRI 2 and 3. Requiring it on unsupported Rubies will result in a \
no-op. \
Recommended for use only in debugging situations. Do not use this in \
production apps."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "ruby3.2-rubygem-debug_inspector-1.1.0-1.13.aarch64.rpm"
RPM_HASH = "36336b57e15e39dcf6509e82d88133c80cbe80cba114a330c62be684757835e376aac31314b675165a662fab29505492f0b8609177042bb571f1c98fcbe039f1"

RPROVIDES:${PN} += "ruby3.2-rubygem-debug_inspector \
ruby3.2-rubygem-debug_inspector(aarch-64) \
rubygem(debug_inspector) \
rubygem(ruby:3.2.0:debug_inspector) \
rubygem(ruby:3.2.0:debug_inspector:1) \
rubygem(ruby:3.2.0:debug_inspector:1.1) \
rubygem(ruby:3.2.0:debug_inspector:1.1.0)"

RDEPENDS:${PN} += "libc.so.6(GLIBC_2.17)(64bit) \
libm.so.6()(64bit) \
libruby3.2.so.3.2()(64bit) \
ruby(abi)"

inherit rpm
