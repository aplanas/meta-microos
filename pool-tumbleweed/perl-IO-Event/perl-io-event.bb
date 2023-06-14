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

RPM_NAME = "perl-IO-Event-0.813-1.20.noarch.rpm"
RPM_HASH = "d67b92b9fff864476cb890f623c993ed743f08cff3d1363010ab2824b2c6e573260541fe4de9eb2788aef79204527cd8ac6820db87ca74cbb5a401a1615bef77"
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

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
perl-IO--Handle \
perl-List--MoreUtils \
perl-Time--HiRes"

inherit rpm
