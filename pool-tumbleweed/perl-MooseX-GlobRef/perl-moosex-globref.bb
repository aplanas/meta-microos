SUMMARY = "Store a Moose object in glob reference"
DESCRIPTION = "This module allows to store Moose object in glob reference of file handle. \
The class attributes will be stored in hash slot associated with glob \
reference. It allows to create a Moose version of the IO::Handle manpage. \
 \
The attributes can be accessed directly with following expression: \
 \
  my $hashref = \\%{*$self}; \
  print $hashref->{key}; \
 \
or shorter: \
 \
  print *$self->{key}; \
 \
but the standard accessors should be used instead: \
 \
  print $self->key;"
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.0701"

RPM_NAME = "perl-MooseX-GlobRef-0.0701-9.25.noarch.rpm"
RPM_HASH = "2730a93457481062cda57d1078110fd413482b98a69150cfca5864638c7042b934208dad8cd1831fa12485b26609a4fb5d85ae6180d7f732bdc236a97d802b6b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooseX--GlobRef \
perl-MooseX--GlobRef--Object \
perl-MooseX--GlobRef--Role--Meta--Instance \
perl-MooseX--GlobRef--Role--Object \
perl-MooseX-GlobRef"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Moose"

inherit rpm
