SUMMARY = "Message Handling Functions"
DESCRIPTION = "The gettext module permits access from perl to the gettext() family of \
functions for retrieving message strings from databases constructed to \
internationalize software. \
 \
* $d = Locale::gettext->domain(DOMAIN) \
 \
* $d = Locale::gettext->domain_raw(DOMAIN) \
 \
  Creates a new object for retrieving strings in the domain *DOMAIN* and \
  returns it. 'domain' requests that strings be returned as Perl strings \
  (possibly with wide characters) if possible while 'domain_raw' requests \
  that octet strings directly from functions like 'dgettext()'. \
 \
* $d->get(MSGID) \
 \
  Calls 'dgettext()' to return the translated string for the given *MSGID*. \
 \
* $d->cget(MSGID, CATEGORY) \
 \
  Calls 'dcgettext()' to return the translated string for the given *MSGID* \
  in the given *CATEGORY*. \
 \
* $d->nget(MSGID, MSGID_PLURAL, N) \
 \
  Calls 'dngettext()' to return the translated string for the given *MSGID* \
  or *MSGID_PLURAL* depending on *N*. \
 \
* $d->ncget(MSGID, MSGID_PLURAL, N, CATEGORY) \
 \
  Calls 'dngettext()' to return the translated string for the given *MSGID* \
  or *MSGID_PLURAL* depending on *N* in the given *CATEGORY*. \
 \
* $d->dir([NEWDIR]) \
 \
  If *NEWDIR* is given, calls 'bindtextdomain' to set the name of the \
  directory where messages for the domain represented by '$d' are found. \
  Returns the (possibly changed) current directory name. \
 \
* $d->codeset([NEWCODE]) \
 \
  For instances created with 'Locale::gettext->domain_raw', manuiplates the \
  character set of the returned strings. If *NEWCODE* is given, calls \
  'bind_textdomain_codeset' to set the character encoding in which messages \
  for the domain represented by '$d' are returned. Returns the (possibly \
  changed) current encoding name. \
 \
gettext(), dgettext(), and dcgettext() attempt to retrieve a string \
matching their 'msgid' parameter within the context of the current locale. \
dcgettext() takes the message's category and the text domain as parameters \
while dgettext() defaults to the LC_MESSAGES category and gettext() \
defaults to LC_MESSAGES and uses the current text domain. If the string is \
not found in the database, then 'msgid' is returned. \
 \
ngettext(), dngettext(), and dcngettext() function similarily but implement \
differentiation of messages between singular and plural. See the \
documentation for the corresponding C functions for details. \
 \
textdomain() sets the current text domain and returns the previously active \
domain. \
 \
_bindtextdomain(domain, dirname)_ instructs the retrieval functions to look \
for the databases belonging to domain 'domain' in the directory 'dirname' \
 \
_bind_textdomain_codeset(domain, codeset)_ instructs the retrieval \
functions to translate the returned messages to the character encoding \
given by *codeset* if the encoding of the message catalog is known."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.07"

RPM_NAME = "perl-gettext-1.07-1.61.aarch64.rpm"
RPM_HASH = "1bde35f7785b629357f80a03ffea1679ba9bc89b32e137269b4150240d51acb18bb63418f0024f8952b8a0683f3407ba88ed2070654a6018069b6fd5d54aba87"

RPROVIDES:${PN} += "perl-Locale--gettext \
perl-gettext"

RDEPENDS:${PN} += "libc.so.6 \
perl--MODULE-COMPAT-5.36.1"

inherit rpm
