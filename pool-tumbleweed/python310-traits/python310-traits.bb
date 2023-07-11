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

RPM_NAME = "python310-traits-6.3.1-1.12.aarch64.rpm"
RPM_HASH = "e3fab7b5f5f838d0fbcd09934ba0ec9963066bba6ee81a734a57aec75ac997b0fcfbfe8ad818fe4ef6bc8e56495941fb1e8caf52f706b395177a2678c734500b"

RPROVIDES:${PN} += "python3.10dist-traits \
python310-traits \
python3dist-traits"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
