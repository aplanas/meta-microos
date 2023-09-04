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

RPM_NAME = "perl-MooseX-GlobRef-0.0701-9.26.noarch.rpm"
RPM_HASH = "0bbe396b39c38d1a8898f04716c58a49d7d32c9e3d95ba1dd77d64d38c9a3ec91e6cc42470b306c3f057e8e1ddaf262c3899434aecde28bf83a65904dfb3fd83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooseX--GlobRef \
perl-MooseX--GlobRef--Object \
perl-MooseX--GlobRef--Role--Meta--Instance \
perl-MooseX--GlobRef--Role--Object \
perl-MooseX-GlobRef"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Moose"

inherit rpm
