SUMMARY = "Facets-bread collection of Hash-like classes"
DESCRIPTION = "The Hashery is a tight collection of Hash-like classes. Included among its \
many offerings are the auto-sorting Dictionary class, the efficient LRUHash, \
the flexible OpenHash and the convenient KeyHash. Nearly every class is a \
subclass of the CRUDHash which defines a CRUD model on top of Ruby's standard \
Hash making it a snap to subclass and augment to fit any specific use case."
LICENSE = "BSD-2-Clause"

PV = "2.1.2"

RPM_NAME = "ruby3.2-rubygem-hashery-2.1.2-2.14.aarch64.rpm"
RPM_HASH = "c4d29db79e91e0df71563cae6eb0b70b14098a59f451eb7f922c90ef92816a37a84e4f80e890daa565a9fcf2691523d8760355917b7aee2f02dad2e4fed4086b"

RPROVIDES:${PN} += "ruby3.2-rubygem-hashery \
ruby3.2-rubygem-hashery(aarch-64) \
rubygem(hashery) \
rubygem(ruby:3.2.0:hashery) \
rubygem(ruby:3.2.0:hashery:2) \
rubygem(ruby:3.2.0:hashery:2.1) \
rubygem(ruby:3.2.0:hashery:2.1.2)"

RDEPENDS:${PN} += "ruby(abi)"

inherit rpm
