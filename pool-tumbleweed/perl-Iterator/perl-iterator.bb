SUMMARY = "A general-purpose iterator class"
DESCRIPTION = "This module is meant to be the definitive implementation of iterators, as \
popularized by Mark Jason Dominus's lectures and recent book (_Higher Order \
Perl_, Morgan Kauffman, 2005). \
 \
An 'iterator' is an object, represented as a code block that generates the \
'next value' of a sequence, and generally implemented as a closure. When \
you need a value to operate on, you pull it from the iterator. If it \
depends on other iterators, it pulls values from them when it needs to. \
Iterators can be chained together (see the Iterator::Util manpage for \
functions that help you do just that), queueing up work to be done but _not \
actually doing it_ until a value is needed at the front end of the chain. \
At that time, one data value is pulled through the chain. \
 \
Contrast this with ordinary array processing, where you load or compute all \
of the input values at once, then loop over them in memory. It's analogous \
to the difference between looping over a file one line at a time, and \
reading the entire file into an array of lines before operating on it. \
 \
Iterator.pm provides a class that simplifies creation and use of these \
iterator objects. Other 'Iterator::' modules (see the /'SEE ALSO' manpage) \
provide many general-purpose and special-purpose iterator functions. \
 \
Some iterators are infinite (that is, they generate infinite sequences), \
and some are finite. When the end of a finite sequence is reached, the \
iterator code block should throw an exception of the type \
'Iterator::X::Am_Now_Exhausted'; this is usually done via the the /is_done \
manpage function.. This will signal the Iterator class to mark the object \
as exhausted. The the /is_exhausted manpage method will then return true, \
and the the /isnt_exhausted manpage method will return false. Any further \
calls to the the /value manpage method will throw an exception of the type \
'Iterator::X::Exhausted'. See the /DIAGNOSTICS manpage. \
 \
Note that in many, many cases, you will not need to explicitly create an \
iterator; there are plenty of iterator generation and manipulation \
functions in the other associated modules. You can just plug them together \
like building blocks."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.03"

RPM_NAME = "perl-Iterator-0.03-14.26.noarch.rpm"
RPM_HASH = "209a793c6a83eacd6190b8b6396f9fca0344e325c4e64fd708cf5e0d1df81320bdbb1d86e8885744df40762c502971ba6b523998cb31344a376a13c873e4ebd5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Iterator"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
perl-Exception--Class"

inherit rpm
