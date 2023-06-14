SUMMARY = "Redis driver based on Mojo::IOLoop"
DESCRIPTION = "Mojo::Redis is a Redis driver that use the Mojo::IOLoop, which makes it \
integrate easily with the Mojolicious framework. \
 \
It tries to mimic the same interface as Mojo::Pg, Mojo::mysql and \
Mojo::SQLite, but the methods for talking to the database vary. \
 \
This module is in no way compatible with the 1.xx version of 'Mojo::Redis' \
and this version also tries to fix a lot of the confusing methods in \
'Mojo::Redis2' related to pubsub. \
 \
This module is currently EXPERIMENTAL, and bad design decisions will be \
fixed without warning. Please report at \
https://github.com/jhthorsen/mojo-redis/issues if you find this module \
useful, annoying or if you simply find bugs. Feedback can also be sent to \
'jhthorsen@cpan.org'."
LICENSE = "Artistic-2.0"

PV = "3.29"

RPM_NAME = "perl-Mojo-Redis-3.29-1.7.noarch.rpm"
RPM_HASH = "804103d3f9920ae057837db6b9b738ad94e4b0a57c5267dfaeff814ceff81fbffcb82c5ec81f1a2e1b08371c530d0a4be08765402f7ea8ade313a711525eae5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Mojo--Redis \
perl-Mojo--Redis--Cache \
perl-Mojo--Redis--Connection \
perl-Mojo--Redis--Connection--Offline \
perl-Mojo--Redis--Cursor \
perl-Mojo--Redis--Database \
perl-Mojo--Redis--PubSub \
perl-Mojo-Redis"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
perl-Mojolicious \
perl-Protocol--Redis--Faster"

inherit rpm
