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

RPM_NAME = "perl-Mojo-Redis-3.29-1.9.noarch.rpm"
RPM_HASH = "75470ad1e2a50b6faca001742983f6b596b5a91c890e56e311c70fd30a7f460b6e041e7fa3aa0673db4ef87558fbb448dbaf8d7a935aa9a4584289ff05dd7d5a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Mojo--Redis \
perl-Mojo--Redis--Cache \
perl-Mojo--Redis--Connection \
perl-Mojo--Redis--Connection--Offline \
perl-Mojo--Redis--Cursor \
perl-Mojo--Redis--Database \
perl-Mojo--Redis--PubSub \
perl-Mojo-Redis"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Mojolicious \
perl-Protocol--Redis--Faster"

inherit rpm
