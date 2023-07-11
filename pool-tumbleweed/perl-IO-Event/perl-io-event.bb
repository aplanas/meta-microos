SUMMARY = "Tied Filehandles for Nonblocking IO with Object Callbacks"
DESCRIPTION = "IO::Event provides a object-based callback system for handling nonblocking \
IO. The design goal is to provide a system that just does the right thing \
w/o the user needing to think about it much. \
 \
All APIs are kept as simple as possible yet at the same time, all \
functionality is accesible if needed. Simple things are easy. Hard things \
are possible. \
 \
Most of the time file handling syntax will work fine: '<$filehandle>' and \
'print $filehandle 'stuff''. \
 \
IO::Event provides automatic buffering of output (with a callback to \
throttle). It provides automatic line-at-a-time input. \
 \
After initial setup, call 'IO::Event::loop()'. \
 \
IO::Event was originally written to use the Event manpage. IO::Event still \
defaults to using the Event manpage but it can now use the AnyEvent manpage \
or its own event loop."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.813"

RPM_NAME = "perl-IO-Event-0.813-1.21.noarch.rpm"
RPM_HASH = "afcff449700591bef68d3d7dac6ac3b95dc7a83a38bad9ab564cadab32316c7f9623d5481f672d7b6eda70a39a2dd9049c47b84794f434416e237f76634edcec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-IO--Event \
perl-IO--Event--AnyEvent \
perl-IO--Event--Callback \
perl-IO--Event--Emulate \
perl-IO--Event--Event \
perl-IO--Event--INET--Callback \
perl-IO--Event--Socket--UNIX \
perl-IO--Event--UNIX--Callback \
perl-IO-Event"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-IO--Handle \
perl-List--MoreUtils \
perl-Time--HiRes"

inherit rpm
