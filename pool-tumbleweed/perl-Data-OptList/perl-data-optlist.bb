SUMMARY = "Parse and validate simple name/value option pairs"
DESCRIPTION = "Hashes are great for storing named data, but if you want more than one \
entry for a name, you have to use a list of pairs. Even then, this is \
really boring to write: \
 \
  $values = [ \
    foo => undef, \
    bar => undef, \
    baz => undef, \
    xyz => { ... }, \
  ]; \
 \
Just look at all those undefs! Don't worry, we can get rid of those: \
 \
  $values = [ \
    map { $_ => undef } qw(foo bar baz), \
    xyz => { ... }, \
  ]; \
 \
Aaaauuugh! We've saved a little typing, but now it requires thought to \
read, and thinking is even worse than typing... and it's got a bug! It \
looked right, didn't it? Well, the 'xyz => { ... }' gets consumed by the \
map, and we don't get the data we wanted. \
 \
With Data::OptList, you can do this instead: \
 \
  $values = Data::OptList::mkopt([ \
    qw(foo bar baz), \
    xyz => { ... }, \
  ]); \
 \
This works by assuming that any defined scalar is a name and any reference \
following a name is its value."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.114"

RPM_NAME = "perl-Data-OptList-0.114-1.1.noarch.rpm"
RPM_HASH = "138ba9d9b28fb31464b9b51ca99467c362a1ad87f6df912c6c9e0a2cd697c5908dcf33dbfaa953a3ec6369cf3629a18fbad36d88ac48737e9597bc6b15fe95df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Data--OptList \
perl-Data-OptList"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
perl-Params--Util \
perl-Sub--Install"

inherit rpm
