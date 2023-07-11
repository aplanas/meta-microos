SUMMARY = "Explicitly typed attributes for Python"
DESCRIPTION = "The traits package developed by Enthought provides a special type definition \
called a trait. Although they can be used as normal Python object attributes, \
traits also have several additional characteristics: \
 \
 * Initialization: A trait can be assigned a default value. \
 * Validation: A trait attribute's type can be explicitly declared. \
 * Delegation: The value of a trait attribute can be contained either \
   in another object. \
 * Notification: Setting the value of a trait attribute can trigger \
   notification of other parts of the program. \
 * Visualization: User interfaces that permit the interactive \
   modification of a trait's value can be automatically constructed \
   using the trait's definition. \
 \
Part of the Enthought Tool Suite (ETS)."
LICENSE = "BSD-3-Clause & EPL-1.0 & LGPL-2.1-only"

PV = "6.3.1"

RPM_NAME = "python39-traits-6.3.1-1.12.aarch64.rpm"
RPM_HASH = "48f3cc4f953dd6361f07ca8296fbc88d5b417df21183afbc9b71f9201a9955fb6d89e26c7fd31bc862f47b13d9ed27bce1dd8f7f140343103964a9d636909e6c"

RPROVIDES:${PN} += "python3.9dist-traits \
python39-traits \
python3dist-traits"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
