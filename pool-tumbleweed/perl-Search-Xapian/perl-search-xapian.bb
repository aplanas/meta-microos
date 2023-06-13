SUMMARY = "Perl XS frontend to the Xapian C++ search library"
DESCRIPTION = "This module wraps most methods of most Xapian classes. The missing classes \
and methods should be added in the future. It also provides a simplified, \
more 'perlish' interface to some common operations, as demonstrated above. \
 \
There are some gaps in the POD documentation for wrapped classes, but you \
can read the Xapian C++ API documentation at \
https://xapian.org/docs/apidoc/html/annotated.html for details of these. \
Alternatively, take a look at the code in the examples and tests. \
 \
If you want to use Search::Xapian and the threads module together, make \
sure you're using Search::Xapian >= 1.0.4.0 and Perl >= 5.8.7. As of \
1.0.4.0, Search::Xapian uses CLONE_SKIP to make sure that the perl wrapper \
objects aren't copied to new threads - without this the underlying C++ \
objects can get destroyed more than once. \
 \
If you encounter problems, or have any comments, suggestions, patches, etc \
please email the Xapian-discuss mailing list (details of which can be found \
at https://xapian.org/lists)."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.2.25.5"

RPM_NAME = "perl-Search-Xapian-1.2.25.5-1.9.aarch64.rpm"
RPM_HASH = "1fd3b4ba0d7c4719c6dbdf3174cd762a3c710680d1bb89f02d96275d4d768792a4ef34fd95f84185685b3d9101183721f34bcc2b944728e50ef5529a83260397"

RPROVIDES:${PN} += "perl(Search::Xapian) \
perl(Search::Xapian::AssertionError) \
perl(Search::Xapian::BM25Weight) \
perl(Search::Xapian::BoolWeight) \
perl(Search::Xapian::Database) \
perl(Search::Xapian::DatabaseClosedError) \
perl(Search::Xapian::DatabaseCorruptError) \
perl(Search::Xapian::DatabaseCreateError) \
perl(Search::Xapian::DatabaseError) \
perl(Search::Xapian::DatabaseLockError) \
perl(Search::Xapian::DatabaseModifiedError) \
perl(Search::Xapian::DatabaseNotFoundError) \
perl(Search::Xapian::DatabaseOpeningError) \
perl(Search::Xapian::DatabaseVersionError) \
perl(Search::Xapian::DocNotFoundError) \
perl(Search::Xapian::Document) \
perl(Search::Xapian::ESet) \
perl(Search::Xapian::ESetIterator) \
perl(Search::Xapian::Enquire) \
perl(Search::Xapian::Error) \
perl(Search::Xapian::FeatureUnavailableError) \
perl(Search::Xapian::InternalError) \
perl(Search::Xapian::InvalidArgumentError) \
perl(Search::Xapian::InvalidOperationError) \
perl(Search::Xapian::LogicError) \
perl(Search::Xapian::MSet) \
perl(Search::Xapian::MSet::Tied) \
perl(Search::Xapian::MSetIterator) \
perl(Search::Xapian::MatchSpy) \
perl(Search::Xapian::MultiValueSorter) \
perl(Search::Xapian::NetworkError) \
perl(Search::Xapian::NetworkTimeoutError) \
perl(Search::Xapian::PerlStopper) \
perl(Search::Xapian::PositionIterator) \
perl(Search::Xapian::PostingIterator) \
perl(Search::Xapian::Query) \
perl(Search::Xapian::QueryParser) \
perl(Search::Xapian::QueryParserError) \
perl(Search::Xapian::RSet) \
perl(Search::Xapian::RangeError) \
perl(Search::Xapian::RuntimeError) \
perl(Search::Xapian::SerialisationError) \
perl(Search::Xapian::SimpleStopper) \
perl(Search::Xapian::Stem) \
perl(Search::Xapian::Stopper) \
perl(Search::Xapian::TermGenerator) \
perl(Search::Xapian::TermIterator) \
perl(Search::Xapian::TradWeight) \
perl(Search::Xapian::UnimplementedError) \
perl(Search::Xapian::ValueCountMatchSpy) \
perl(Search::Xapian::ValueIterator) \
perl(Search::Xapian::Weight) \
perl(Search::Xapian::WildcardError) \
perl(Search::Xapian::WritableDatabase) \
perl(exception_data) \
perl-Search-Xapian \
perl-Search-Xapian(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libxapian.so.30()(64bit) \
perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
