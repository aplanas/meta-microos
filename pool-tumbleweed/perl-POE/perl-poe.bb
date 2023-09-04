SUMMARY = "Portable, event-loop agnostic eventy networking and multitasking"
DESCRIPTION = "POE is a framework for cooperative, event driven multitasking and \
networking in Perl. Other languages have similar frameworks. Python has \
Twisted. TCL has 'the event loop'. \
 \
POE provides a unified interface for several other event loops, including \
select(), IO::Poll, Glib, Gtk, Tk, Wx, and Gtk2. Many of these event loop \
interfaces were written by others, with the help of POE::Test::Loops. They \
may be found on the CPAN. \
 \
POE achieves its high degree of portability to different operating systems \
and Perl versions by being written entirely in Perl. CPAN hosts optional XS \
modules for POE if speed is more desirable than portability. \
 \
POE is designed in layers. Each layer builds atop the lower level ones. \
Programs are free to use POE at any level of abstraction, and different \
levels can be mixed and matched seamlessly within a single program. \
Remember, though, that higher-level abstractions often require more \
resources than lower-level ones. The conveniences they provide are not \
free. \
 \
POE's bundled abstraction layers are the tip of a growing iceberg. \
Sprocket, POE::Stage, and other CPAN distributions build upon this work. \
You're encouraged to look around. \
 \
No matter how high you go, though, it all boils down to calls to \
POE::Kernel. So your down-to-earth code can easily cooperate with \
stratospheric systems."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.370"

RPM_NAME = "perl-POE-1.370-1.9.noarch.rpm"
RPM_HASH = "7106dfaefe3f371935cbe69d9d6841e386e3699da1b995a5df5c49c992d58abee12cb5f14bf98be0678167f9d3d463016dab225c7f69cbcc1b4dd4f307e3189f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-POE \
perl-POE--Component \
perl-POE--Component--Client--TCP \
perl-POE--Component--Server--TCP \
perl-POE--Driver \
perl-POE--Driver--SysRW \
perl-POE--Filter \
perl-POE--Filter--Block \
perl-POE--Filter--Grep \
perl-POE--Filter--HTTPD \
perl-POE--Filter--Line \
perl-POE--Filter--Map \
perl-POE--Filter--RecordBlock \
perl-POE--Filter--Reference \
perl-POE--Filter--Stackable \
perl-POE--Filter--Stream \
perl-POE--Kernel \
perl-POE--Loop \
perl-POE--Loop--IO-Poll \
perl-POE--Loop--PerlSignals \
perl-POE--Loop--Select \
perl-POE--NFA \
perl-POE--Pipe \
perl-POE--Pipe--OneWay \
perl-POE--Pipe--TwoWay \
perl-POE--Queue \
perl-POE--Queue--Array \
perl-POE--Resource \
perl-POE--Resource--Aliases \
perl-POE--Resource--Clock \
perl-POE--Resource--Events \
perl-POE--Resource--Extrefs \
perl-POE--Resource--FileHandles \
perl-POE--Resource--SIDs \
perl-POE--Resource--Sessions \
perl-POE--Resource--Signals \
perl-POE--Resources \
perl-POE--Session \
perl-POE--Test--Sequence \
perl-POE--Wheel \
perl-POE--Wheel--Curses \
perl-POE--Wheel--FollowTail \
perl-POE--Wheel--ListenAccept \
perl-POE--Wheel--ReadLine \
perl-POE--Wheel--ReadLine--Keymap \
perl-POE--Wheel--ReadWrite \
perl-POE--Wheel--Run \
perl-POE--Wheel--SocketFactory"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-IO \
perl-IO--Handle \
perl-IO--Pipely \
perl-IO--Tty \
perl-POE--Test--Loops \
perl-Storable"

inherit rpm
