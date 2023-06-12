SUMMARY = "The DBI of event loop programming"
DESCRIPTION = "AnyEvent provides a uniform interface to various event loops. This allows \
module authors to use event loop functionality without forcing module users \
to use a specific event loop implementation (since more than one event loop \
cannot coexist peacefully). \
 \
The interface itself is vaguely similar, but not identical to the Event \
module. \
 \
During the first call of any watcher-creation method, the module tries to \
detect the currently loaded event loop by probing whether one of the \
following modules is already loaded: EV, AnyEvent::Loop, Event, Glib, Tk, \
Event::Lib, Qt, POE. The first one found is used. If none are detected, the \
module tries to load the first four modules in the order given; but note \
that if EV is not available, the pure-perl AnyEvent::Loop should always \
work, so the other two are not normally tried. \
 \
Because AnyEvent first checks for modules that are already loaded, loading \
an event model explicitly before first using AnyEvent will likely make that \
model the default. For example: \
 \
   use Tk; \
   use AnyEvent; \
 \
    \
 \
The _likely_ means that, if any module loads another event model and starts \
using it, all bets are off - this case should be very rare though, as very \
few modules hardcode event loops without announcing this very loudly. \
 \
The pure-perl implementation of AnyEvent is called 'AnyEvent::Loop'. Like \
other event modules you can load it explicitly and enjoy the high \
availability of that event loop :)"
LICENSE = "GPL-1.0-or-later | Artistic-1.0"

PV = "7.17"

RPM_NAME = "perl-AnyEvent-7.17-1.15.aarch64.rpm"
RPM_HASH = "70fea563045d0635b5352e068b2dc4f3f4b41dd68e88918c9c92265d556b1078d205c9e42a09e5699828b8eea42d8e53a9ebcee07a3634fbd2013d444a91b7e9"

RPROVIDES:${PN} += "perl(AE) \
perl(AE::Log::COLLECT) \
perl(AE::Log::FILTER) \
perl(AE::Log::LOG) \
perl(AnyEvent) \
perl(AnyEvent::Base) \
perl(AnyEvent::CondVar) \
perl(AnyEvent::CondVar::Base) \
perl(AnyEvent::DNS) \
perl(AnyEvent::Debug) \
perl(AnyEvent::Debug::Backtrace) \
perl(AnyEvent::Debug::Wrap) \
perl(AnyEvent::Debug::Wrapped) \
perl(AnyEvent::Debug::shell) \
perl(AnyEvent::Handle) \
perl(AnyEvent::IO) \
perl(AnyEvent::IO::IOAIO) \
perl(AnyEvent::IO::Perl) \
perl(AnyEvent::Impl::Cocoa) \
perl(AnyEvent::Impl::EV) \
perl(AnyEvent::Impl::Event) \
perl(AnyEvent::Impl::EventLib) \
perl(AnyEvent::Impl::FLTK) \
perl(AnyEvent::Impl::Glib) \
perl(AnyEvent::Impl::IOAsync) \
perl(AnyEvent::Impl::Irssi) \
perl(AnyEvent::Impl::POE) \
perl(AnyEvent::Impl::Perl) \
perl(AnyEvent::Impl::Qt) \
perl(AnyEvent::Impl::Qt::Io) \
perl(AnyEvent::Impl::Qt::Timer) \
perl(AnyEvent::Impl::Tk) \
perl(AnyEvent::Impl::UV) \
perl(AnyEvent::Log) \
perl(AnyEvent::Log::COLLECT) \
perl(AnyEvent::Log::Ctx) \
perl(AnyEvent::Log::FILTER) \
perl(AnyEvent::Log::LOG) \
perl(AnyEvent::Loop) \
perl(AnyEvent::Socket) \
perl(AnyEvent::Strict) \
perl(AnyEvent::TLS) \
perl(AnyEvent::Util) \
perl(DB) \
perl-AnyEvent \
perl-AnyEvent(aarch-64)"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
