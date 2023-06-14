SUMMARY = "Diff::LCS computes the difference between two Enumerable sequences"
DESCRIPTION = "Diff::LCS computes the difference between two Enumerable sequences using the \
McIlroy-Hunt longest common subsequence (LCS) algorithm. It includes utilities \
to create a simple HTML diff output format and a standard diff-like tool. \
This is release 1.4.3, providing a simple extension that allows for \
Diff::LCS::Change objects to be treated implicitly as arrays and fixes a \
number of formatting issues. \
Ruby versions below 2.5 are soft-deprecated, which means that older versions \
are no longer part of the CI test suite. If any changes have been introduced \
that break those versions, bug reports and patches will be accepted, but it \
will be up to the reporter to verify any fixes prior to release. The next \
major release will completely break compatibility."
LICENSE = "MIT & Artistic-2.0 & GPL-2.0-only"

PV = "1.5.0"

RPM_NAME = "ruby3.2-rubygem-diff-lcs-1.5.0-1.12.aarch64.rpm"
RPM_HASH = "9edad2ce90c07dd400f9bdeea8535285e3fc5a2a35c35a311c80d55007fe042a05d64662b4424a5f08a575777022a12fec9f1c979c01eb249b6db78588a24034"

RPROVIDES:${PN} += "ruby3.2-rubygem-diff-lcs \
rubygem-diff-lcs \
rubygem-ruby-3.2.0-diff-lcs \
rubygem-ruby-3.2.0-diff-lcs-1 \
rubygem-ruby-3.2.0-diff-lcs-1.5 \
rubygem-ruby-3.2.0-diff-lcs-1.5.0"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/ruby.ruby3.2 \
ruby-abi \
update-alternatives"

inherit rpm
