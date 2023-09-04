SUMMARY = "Manages sets of integers"
DESCRIPTION = "'Set::IntSpan' manages sets of integers. It is optimized for sets that have \
long runs of consecutive integers. These arise, for example, in .newsrc \
files, which maintain lists of articles: \
 \
  alt.foo: 1-21,28,31 \
  alt.bar: 1-14192,14194,14196-14221 \
 \
A run of consecutive integers is sometimes called a _span_. \
 \
Sets are stored internally in a run-length coded form. This provides for \
both compact storage and efficient computation. In particular, set \
operations can be performed directly on the encoded representation. \
 \
'Set::IntSpan' is designed to manage finite sets. However, it can also \
represent some simple infinite sets, such as { x | x>n }. This allows \
operations involving complements to be carried out consistently, without \
having to worry about the actual value of INT_MAX on your machine."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "1.19"

RPM_NAME = "perl-Set-IntSpan-1.19-1.15.noarch.rpm"
RPM_HASH = "26c5aa0d8e9562b8bc74f8f35575dde362ce95cd2681869f72740cacb09aa5798cd8bac1eb9bd8ee7b7f0f3600685ee0acf80b9aff49f9a6322b48f1b314cb7d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Set--IntSpan \
perl-Set-IntSpan"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
