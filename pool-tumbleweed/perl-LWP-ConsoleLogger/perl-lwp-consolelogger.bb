SUMMARY = "LWP tracing and debugging"
DESCRIPTION = "It can be hard (or at least tedious) to debug mechanize scripts. LWP::Debug \
is deprecated. It suggests you write your own debugging handlers, set up a \
proxy or install Wireshark. Those are all workable solutions, but this \
module exists to save you some of that work. The guts of this module are \
stolen from Plack::Middleware::DebugLogging, which in turn stole most of \
its internals from Catalyst. If you're new to LWP::ConsoleLogger, I suggest \
getting started with the LWP::ConsoleLogger::Easy wrapper. This will get \
you up and running in minutes. If you need to tweak the settings that \
LWP::ConsoleLogger::Easy chooses for you (or if you just want to be fancy), \
please read on. \
 \
Since this is a debugging library, I've left as much mutable state as \
possible, so that you can easily toggle output on and off and otherwise \
adjust how you deal with the output."
LICENSE = "Artistic-2.0"

PV = "1.000001"

RPM_NAME = "perl-LWP-ConsoleLogger-1.000001-1.1.noarch.rpm"
RPM_HASH = "5e105161c693ffe0fada34992bc83b5818bf96db4ab39d6a2a093eac0df27635c3b5c5d642dea48718f84badb4387dffc60f825b9b0bf44cad1043daa590e48a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-LWP--ConsoleLogger \
perl-LWP--ConsoleLogger--Easy \
perl-LWP--ConsoleLogger--Everywhere \
perl-LWP-ConsoleLogger"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Class--Method--Modifiers \
perl-Data--Printer \
perl-DateTime \
perl-HTML--Restrict \
perl-HTTP--Body \
perl-HTTP--CookieMonster \
perl-HTTP--Request \
perl-HTTP--Response \
perl-JSON--MaybeXS \
perl-List--AllUtils \
perl-Log--Dispatch \
perl-Module--Load--Conditional \
perl-Module--Runtime \
perl-Moo \
perl-MooX--StrictConstructor \
perl-Parse--MIME \
perl-Ref--Util \
perl-String--Trim \
perl-Sub--Exporter \
perl-Term--Size--Any \
perl-Text--SimpleTable--AutoWidth \
perl-Try--Tiny \
perl-Types--Common--Numeric \
perl-Types--Standard \
perl-URI--QueryParam \
perl-XML--Simple"

inherit rpm
