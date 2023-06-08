SUMMARY = "Text fonts from George Douros"
DESCRIPTION = "Greek typefaces: \
 \
- Aroania, based on the ‘New Hellenic’ font by Victor Julius Scholderer \
  (1880-1971). \
- Anaktoria, grecs du roi was designed by Claude Garamond (1480 – 1561) \
  between 1541 and 1544, commissioned by king Francis I of France, for the \
  exclusive use by the Imprimerie Nationale in Paris. Greek in Akaktoria is \
  based on a modern version of Grecs du roi prepared by Mindaugas Strockis in \
  2001. Lowercase Latin stems from the titles in the 1623 First Folio Edition \
  of Shakespeare. Scott Mann & Peter Guither prepared a modern version for The \
  Illinois Shakespeare Festival in 1995. Cyrillic has been designed to match \
  the above Greek and Latin. The font covers the Windows Glyph List, Greek \
  Extended, various typographic extras and some Open Type features \
  (Numerators, Denominators, Fractions, Old Style Figures, Historical Forms, \
  Stylistic Alternates, Ligatures, Swash Capitals). \
- Alexander, a text typeface using the Greek letters designed by Alexander \
  Wilson (1714-1786), a Scottish doctor, astronomer, and typefounder. The type \
  was especially designed for an edition of Homer’s epics, published in 1756-8 \
  by Andrew and Robert Foulis, printers to the University of Glasgow. A modern \
  revival, Wilson Greek, has been designed by Matthew Carter in 1995. Peter S. \
  Baker is also using Wilson’s Greek type in his Junicode font for medieval \
  scholars (2007). Latin and Cyrillic are based on a Garamond typeface. The \
  font covers the Windows Glyph List, Greek Extended, IPA Extensions, Ancient \
  Greek Numbers, Byzantine and Ancient Greek Musical Notation, various \
  typographic extras and several Open Type features (Case-Sensitive Forms, \
  Small Capitals, Subscript, Superscript, Numerators, Denominators, Fractions, \
  Old Style Figures, Historical Forms, Stylistic Alternates, Ligatures). \
- Avdira, based on the lowercase Greek letters in the typeface used \
  by Demetrios Damilas for the edition of Isocrates, published in Milan in \
  1493. A digital revival, was prepared by Ralph P. Hancock, in his Milan \
  (Mediolanum) font. Italic Greek were designed in 1802 by Richard Porson \
  (1757 – 1808) and cut by Richard Austin. They were first used by Cambridge \
  University Press in 1810. Capitals, Latin and Cyrillic, as well as the \
  complete bold weights, have been designed in an attempt to create a \
  well-balanced font. The font covers the Windows Glyph List, Greek Extended, \
  various typographic extras and is available in regular, italic, bold and \
  bold italic. The regular style of the font also covers IPA Extensions, \
  Ancient Greek Numbers, Byzantine and Ancient Greek Musical Notation and \
  several Open Type features (Case-Sensitive Forms, Small Capitals, Subscript, \
  Superscript, Numerators, Denominators, Fractions, Old Style Figures, \
  Historical Forms, Stylistic Alternates, Ligatures). \
- Asea, typeface with four styles covering almost the whole Greek script as \
  defined by unicode, by Firmin Didot (1764-1836)."
LICENSE = "SUSE-Permissive"

PV = "8.01"

RPM_NAME = "gdouros-text-fonts-8.01-1.14.noarch.rpm"
RPM_HASH = "9423e62b56c853ac82227e3755ffdb9aa8fe9b85b585c54bea258cff277a8a1fef5dbb6188080926cbb33aeda3de0f3887c6b571cd2d4fb1a3041d6b8b13feb4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "alexander-fonts anaktoria-fonts aroania-fonts avdira-fonts gdouros-alexander-fonts gdouros-anaktoria-fonts gdouros-aroania-fonts gdouros-asea-fonts gdouros-avdira-fonts gdouros-text-fonts"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils perl"

inherit rpm
