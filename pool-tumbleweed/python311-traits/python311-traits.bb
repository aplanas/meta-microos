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

RPM_NAME = "python311-traits-6.3.1-1.12.aarch64.rpm"
RPM_HASH = "96ee092691b3f8e2ea0525d7305a1a63ecf2321ad40cf6a09948bb1ed9476cb105a525b57f317c61fdc42e39ff3f691729d5b29dd1645907149e222d976ede05"

RPROVIDES:${PN} += "python3-traits \
python3.11dist-traits \
python311-traits \
python3dist-traits"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
