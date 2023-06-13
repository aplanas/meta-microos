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

RPM_NAME = "perl-Set-IntSpan-1.19-1.13.noarch.rpm"
RPM_HASH = "9d62f3defdb8ec78c802fde319f6637385ff7d9aa0dd6aec878f3036ea8baef2104fd95d3bd7c9241afd2f8e31b877049c67ab1f58445fecc759e542cd7db8a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Set::IntSpan) \
perl-Set-IntSpan"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
